package by.tc.task01.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.factory.ApplianceFactory;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public ArrayList<Appliance> find(Criteria criteria) {

		ArrayList<Appliance> applianceArray = new ArrayList<Appliance>();

		Set<String> nameCriteria = criteria.getCriteria().keySet();// получаем набор всех ключей

		int numberCriteria = criteria.getCriteria().size();// кол-во критериев

		try {

			File myFile = new File("src/main/java/appliances_db.txt");
			FileReader fileReader = new FileReader(myFile);
			BufferedReader reader = new BufferedReader(fileReader);

			String line = null;

			while ((line = reader.readLine()) != null) {

				String[] typeAndCriteria = line.split(" : ");
				String type = typeAndCriteria[0];

				if (type.equals(criteria.getGroupSearchName()))// когда введенный тип равен типу из файла
				{

					HashMap<String, String> optionAppliance = getOption(typeAndCriteria[1]);

					int counter = 0;

					for (String name : nameCriteria) {

						String value = criteria.getCriteria().get(name).toString();// значение критерия

						if (value.equals(optionAppliance.get(name))) {// кол-во совпадений
							counter++;
						}

					}

					if (counter == numberCriteria) {

						ApplianceFactory factory = new ApplianceFactory();
						Appliance appliance = factory.createAppliance(type, optionAppliance);
						
						applianceArray.add(appliance);

					}

				}

			}

			reader.close();

		} catch (Exception ex) {
			System.out.println("Произошла ошибка");
			System.out.println(ex);

		}

		return applianceArray;
	}

	public HashMap<String, String> getOption(String option) {

		HashMap<String, String> optionAppliance = new HashMap<>();

		String[] criteriaAppliance = option.split(", ");

		for (String criteria : criteriaAppliance) {
			String[] result = criteria.split("=");
			optionAppliance.put(result[0], result[1]);
		}

		return optionAppliance;

	}



}

