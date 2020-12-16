package by.tc.task01.service;

import java.util.ArrayList;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceService {	
	
	ArrayList <Appliance> find(Criteria criteria);
	
}
