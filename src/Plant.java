public class Plant{
	public String[] plantProcessor(FileUtility util){
		int size = util.size();
		int marker = 0;
		String filecontents = "";
		for (int i = 0; i < size; i++){
			String line = util.read();	
			if (line.contains("<PLANT>")){
				if (marker > 0)
					filecontents += "\n";
				marker = i;
			}
			if ((i - marker) > 0 && (i - marker) <= 6)
				filecontents += line;	
			
		}
		util.reset();
		String[] listOfPlants = filecontents.split("\n");
		return listOfPlants;
	}
	public void displayPlants(String[] listOfPlants){
		System.out.println("---------------------------------------------------------------------");
		for(int i =0; i < listOfPlants.length; i++){
			System.out.println(listOfPlants[i]);
		}
		System.out.println("---------------------------------------------------------------------");
	}
	public void addNewPlant(String[] inputs, FileUtility util){
		System.out.println("---------------------------------------------------------------------");
		int size = util.size();
		util.update(size-1, "<PLANT>");
		util.write("<COMMON>" + inputs[0] + "</COMMON>");
		util.write("<BOTANICAL>" + inputs[1] + "</BOTANICAL>");
		util.write("<ZONE>" + inputs[2] + "</ZONE>");
		util.write("<LIGHT>" + inputs[3] + "</LIGHT>");
		util.write("<PRICE>" + inputs[4] + "</PRICE>");
		util.write("<AVAILABILITY>" + inputs[5] + "</AVAILABILITY>");
		util.write("</PLANT>\n</CATALOG>");
		System.out.println("Plant added successfully!");
		System.out.println("---------------------------------------------------------------------");
	}
	public void deletePlant(String plantName, FileUtility util){
		System.out.println("---------------------------------------------------------------------");
		int size = util.size();
		int count = 0;
		boolean flag = false;
		String filecontents = "";
		for (int i = 0; i < size; i++){
			String line = util.read();	
			if (line.contains(plantName)){
				util.update(count, "<COMMON></COMMON>");
				util.update(count+1, "<BOTANICAL></BOTANICAL>");
				util.update(count+2, "<ZONE></ZONE>");
				util.update(count+3, "<LIGHT></LIGHT>");
				util.update(count+4,"<PRICE></PRICE>");
				util.update(count+5, "<AVAILABILITY></AVAILABILITY>");
				flag = true;
			}
			else
				count++;
		}
		util.reset();
		if (flag)		
			System.out.println("Plant deleted successfully!");
		else
			System.out.println("No plant found!");

		System.out.println("---------------------------------------------------------------------");
	}
	public void updatePlant(String plantName, String[] inputs, FileUtility util){
		/*
		add your logic here to update the plant, similar to 
		what was done for deletePlant.
		*/

	}
	public void q1(String[] listOfPlants){
		// q1
		System.out.println("---------------------------------------------------------------------");
		for (String plantinfo: listOfPlants){
			double price = Double.parseDouble(plantinfo.substring(plantinfo.indexOf("<PRICE>") 
										+ 8, 
										plantinfo.indexOf("</PRICE>")));
			if (price < 5.0)
				System.out.println(plantinfo.substring(plantinfo.indexOf("<COMMON>") 
					+ 8, 
					plantinfo.indexOf("</COMMON>")) 
					+ "; price is:" + price);
			
			
		}
		System.out.println("---------------------------------------------------------------------");

	}
	public void q2(String[] listOfPlants){
		// q2
		System.out.println("---------------------------------------------------------------------");
		for (String plantinfo: listOfPlants){
			String light = plantinfo.substring(plantinfo.indexOf("<LIGHT>") 
										+ 7, 
										plantinfo.indexOf("</LIGHT>"));



			if (light.contains("Sunny") ||  light.contains("Sun or Shade"))
				System.out.println(plantinfo.substring(plantinfo.indexOf("<COMMON>") 
					+ 8, 
					plantinfo.indexOf("</COMMON>")) 
					+ "; light is:" + light);
			
		}
		System.out.println("---------------------------------------------------------------------");
	}
	public void q3(String[] listOfPlants){
		// q3
		System.out.println("---------------------------------------------------------------------");
		for (String plantinfo: listOfPlants){
			String zoneAsStr = plantinfo.substring(plantinfo.indexOf("<ZONE>") 
										+ 6, 
											plantinfo.indexOf("</ZONE>"));
			int zone = 0;
			if (!zoneAsStr.contains("Annual") &&
				!zoneAsStr.contains("3 - 5"))
				 zone = Integer.parseInt(zoneAsStr);
			
			if (zone == 3)
				System.out.println(plantinfo.substring(plantinfo.indexOf("<COMMON>") 
					+ 8, 
					plantinfo.indexOf("</COMMON>")) 
					+ "; zone is:" + zone);
		}
		System.out.println("---------------------------------------------------------------------");
	}
	/*
		more operations - 
		addPlant, deletePlant, updatePlant operations ...
	*/
	
	/*
		more implementation (analysis) - 
		// Let us ask some questions on the data:
		// q1 - show the plants that are priced less than 5$?
		// q2 - show the plants that require sunlight?
		// q3 - show the plants that are from planting zone 3?
	*/

}