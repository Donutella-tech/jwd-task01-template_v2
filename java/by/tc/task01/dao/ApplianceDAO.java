package by.tc.task01.dao;

import java.util.ArrayList;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	ArrayList <Appliance> find(Criteria criteria);
}
