package com.me.usingFunction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		List<Map<String, CustomObject>> responseList = new ArrayList<>();
        Map<String, CustomObject> responseMap = new HashMap<>();
        Map<String, CustomObject> responseMap1 = new HashMap<>();

        StringCustomObject elementId = new StringCustomObject();
        elementId.setValue("16ADSD3139");
        responseMap.put("elementId", elementId);
        StringCustomObject updateId = new StringCustomObject();
        updateId.setValue("85783");
        responseMap.put("updateId", updateId);
        StringCustomObject moduleCode = new StringCustomObject();
        moduleCode.setValue("AB65");
        responseMap.put("moduleCode", moduleCode);
        StringCustomObject manufacturePhase = new StringCustomObject();
        manufacturePhase.setValue("product manufactured");
        responseMap.put("manufacturePhase", manufacturePhase);
        StringCustomObject description = new StringCustomObject();
        description.setValue("SLKNFKLSNFLKSKL");
        responseMap.put("description", description);
        StringCustomObject sellerCode = new StringCustomObject();
        sellerCode.setValue("ABC components");
        responseMap.put("sellerCode", sellerCode);
        StringCustomObject elementNumber = new StringCustomObject();
        elementNumber.setValue("2347-274278");
        responseMap.put("elementNumber", elementNumber);
        StringCustomObject laptopModelNumber = new StringCustomObject();
        laptopModelNumber.setValue("L1445");
        responseMap.put("laptopModelNumber", laptopModelNumber);

        StringCustomObject elementIdValue = new StringCustomObject();
        elementIdValue.setValue("164750");
        responseMap1.put("elementId", elementIdValue);
        StringCustomObject updateIdValue = new StringCustomObject();
        updateIdValue.setValue("1791326");
        responseMap1.put("updateId", updateIdValue);
        StringCustomObject moduleCodeValue = new StringCustomObject();
        moduleCodeValue.setValue("DWHJDW");
        responseMap1.put("moduleCode", moduleCodeValue);
        StringCustomObject manufacturePhaseValue = new StringCustomObject();
        manufacturePhaseValue.setValue("Product completed");
        responseMap1.put("manufacturePhase", manufacturePhaseValue);
        StringCustomObject descriptionValue = new StringCustomObject();
        descriptionValue.setValue("AKJDSJKDJKSJK");
        responseMap1.put("description", descriptionValue);
        StringCustomObject elementNumberValue = new StringCustomObject();
        elementNumberValue.setValue("MLB Board Components");
        responseMap1.put("elementNumber", elementNumberValue);
        StringCustomObject sellerCodeValue = new StringCustomObject();
        sellerCodeValue.setValue("932-02386");
        responseMap1.put("sellerCode", sellerCodeValue);
        StringCustomObject laptopModelNumber1 = new StringCustomObject();
        laptopModelNumber1.setValue("L1779");
        responseMap1.put("laptopModelNumber", laptopModelNumber1);

        responseList.add(responseMap);
        responseList.add(responseMap1);

        OutputFilterFunction<List<Map<String, CustomObject>>> OutputFilterFunction = new OutputFilterFunction<>("laptopModelNumber");
        System.out.println(OutputFilterFunction.apply(responseList));
	}

}
