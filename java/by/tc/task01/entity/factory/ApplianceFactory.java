package by.tc.task01.entity.factory;

import java.util.HashMap;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Option;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;

public class ApplianceFactory {

	public Appliance createAppliance(String typeAppliance, HashMap<String, String> criteria) {

		Appliance appliance = null;

		switch (typeAppliance) {

		case "Oven":

			if (criteria.size() == 6 && criteria.containsKey(Option.POWER_CONSUMPTION.toString())
					&& criteria.containsKey(Option.WEIGHT.toString()) && criteria.containsKey(Option.CAPACITY.toString())
					&& criteria.containsKey(Option.DEPTH.toString()) && criteria.containsKey(Option.HEIGHT.toString())
					&& criteria.containsKey(Option.WIDTH.toString())) {

				Oven oven = new Oven();

				oven.setPowerConsumption(criteria.get(Option.POWER_CONSUMPTION.toString()));
				oven.setWeight(criteria.get(Option.WEIGHT.toString()));
				oven.setCapacity(criteria.get(Option.CAPACITY.toString()));
				oven.setDepth(criteria.get(Option.DEPTH.toString()));
				oven.setHeight(criteria.get(Option.HEIGHT.toString()));
				oven.setWidth(criteria.get(Option.WIDTH.toString()));

				appliance = oven;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		case "Laptop":

			if (criteria.size() == 6 && criteria.containsKey(Option.BATTERY_CAPACITY.toString())
					&& criteria.containsKey(Option.OS.toString()) && criteria.containsKey(Option.MEMORY_ROM.toString())
					&& criteria.containsKey(Option.SYSTEM_MEMORY.toString()) && criteria.containsKey(Option.CPU.toString())
					&& criteria.containsKey(Option.DISPLAY_INCHES.toString())) {

				Laptop laptop = new Laptop();

				laptop.setBatteryCapacity(criteria.get(Option.BATTERY_CAPACITY.toString()));
				laptop.setCpu(criteria.get(Option.CPU.toString()));
				laptop.setDisplayInchs(criteria.get(Option.DISPLAY_INCHES.toString()));
				laptop.setMemoryRom(criteria.get(Option.MEMORY_ROM.toString()));
				laptop.setOs(criteria.get(Option.OS.toString()));
				laptop.setSystemMemory(criteria.get(Option.SYSTEM_MEMORY.toString()));

				appliance = laptop;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		case "Refrigerator":

			if (criteria.size() == 6 && criteria.containsKey(Option.POWER_CONSUMPTION.toString())
					&& criteria.containsKey(Option.WEIGHT.toString()) && criteria.containsKey(Option.FREEZER_CAPACITY.toString())
					&& criteria.containsKey(Option.OVERALL_CAPACITY.toString()) && criteria.containsKey(Option.HEIGHT.toString())
					&& criteria.containsKey(Option.WIDTH.toString())) {

				Refrigerator refrigerator = new Refrigerator();

				refrigerator.setFreezerCapacity(criteria.get(Option.FREEZER_CAPACITY.toString()));
				refrigerator.setHeight(criteria.get(Option.HEIGHT.toString()));
				refrigerator.setOverallCapacity(criteria.get(Option.OVERALL_CAPACITY.toString()));
				refrigerator.setPowerConsumption(criteria.get(Option.POWER_CONSUMPTION.toString()));
				refrigerator.setWeight(criteria.get(Option.WEIGHT.toString()));
				refrigerator.setWidth(criteria.get(Option.WIDTH.toString()));

				appliance = refrigerator;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		case "Vacuum Cleaner":

			if (criteria.size() == 6 && criteria.containsKey(Option.POWER_CONSUMPTION.toString())
					&& criteria.containsKey(Option.FILTER_TYPE.toString()) && criteria.containsKey(Option.BAG_TYPE.toString())
					&& criteria.containsKey(Option.WAND_TYPE.toString()) && criteria.containsKey(Option.MOTOR_SPEED_REGULATION.toString())
					&& criteria.containsKey(Option.CLEANING_WIDTH.toString())) {

				VacuumCleaner vacuumCleaner = new VacuumCleaner();

				vacuumCleaner.setBagType(criteria.get(Option.BAG_TYPE.toString()));
				vacuumCleaner.setCleaningWidth(criteria.get(Option.CLEANING_WIDTH.toString()));
				vacuumCleaner.setFilterType(criteria.get(Option.FILTER_TYPE.toString()));
				vacuumCleaner.setMotorSpeedRegulation(criteria.get(Option.MOTOR_SPEED_REGULATION.toString()));
				vacuumCleaner.setPowerConsumption(criteria.get(Option.POWER_CONSUMPTION.toString()));
				vacuumCleaner.setWandType(criteria.get(Option.WAND_TYPE.toString()));

				appliance = vacuumCleaner;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		case "TabletPC":

			if (criteria.size() == 5 && criteria.containsKey(Option.BATTERY_CAPACITY.toString())
					&& criteria.containsKey(Option.DISPLAY_INCHES.toString()) && criteria.containsKey(Option.MEMORY_ROM.toString())
					&& criteria.containsKey(Option.FLASH_MEMORY_CAPACITY.toString()) && criteria.containsKey(Option.COLOR.toString())) {

				TabletPC tabletPC = new TabletPC();

				tabletPC.setBatteryCapacity(criteria.get(Option.BATTERY_CAPACITY.toString()));
				tabletPC.setDisplayInches(criteria.get(Option.DISPLAY_INCHES.toString()));
				tabletPC.setMemoryRom(criteria.get(Option.MEMORY_ROM.toString()));
				tabletPC.setFlashMemoryCapacity(criteria.get(Option.FLASH_MEMORY_CAPACITY.toString()));
				tabletPC.setColor(criteria.get(Option.COLOR.toString()));

				appliance = tabletPC;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		case "Speakers":

			if (criteria.size() == 4 && criteria.containsKey(Option.POWER_CONSUMPTION.toString())
					&& criteria.containsKey(Option.NUMBER_OF_SPEAKERS.toString())
					&& criteria.containsKey(Option.FREQUENCY_RANGE.toString()) && criteria.containsKey(Option.CORD_LENGTH.toString())) {

				Speakers speakers = new Speakers();

				speakers.setPowerConsumption(criteria.get(Option.POWER_CONSUMPTION.toString()));
				speakers.setNumberOfSpeakers(criteria.get(Option.NUMBER_OF_SPEAKERS.toString()));
				speakers.setFrequencyRange(criteria.get(Option.FREQUENCY_RANGE.toString()));
				speakers.setCordLength(criteria.get(Option.CORD_LENGTH.toString()));

				appliance = speakers;

			} else {

				System.out.println("Некорректные параметры");

			}

			break;

		default:
			System.out.println("Данный типа не существует!");

		}

		return appliance;

	}

}
