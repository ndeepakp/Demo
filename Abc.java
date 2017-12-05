
class Abc{
    public List<Map<String, String>> payoutDetailstable(int tableID)
            throws Exception {
        List<Map<String, String>> payOutDetailsRows = new
                ArrayList<Map<String, String>>();
        String payoutDetailsTable = "//table[@id=" + tableID + "]/tbody/tr[*]";
        String payoutDetailsTablecolumns = "//table[@id=" + tableID +
                "]/tbody/tr[*]/th[*]";

        List<WebElement> numberOfRows =
                driverFunctionLib.findElements(By.xpath(payoutDetailsTable), "");
        List<WebElement> numberofColumns =
                driverFunctionLib.findElements(By.xpath(payoutDetailsTablecolumns),
                        "");

        for (int rowNum = 2; rowNum < numberOfRows.size(); rowNum++) {

            HashMap<String, String> payoutTableKeyValue = new HashMap<String, String>();
            List<WebElement> poc = numberOfRows.get(rowNum).findElements(By.tagName("td"));
            for (int tdNum = 0; tdNum < poc.size(); tdNum++) {
                payoutTableKeyValue.put(numberofColumns.get(tdNum).getText(),
                        poc.get(tdNum).getText());
            }
            payOutDetailsRows.add(payoutTableKeyValue);
        }
        return payOutDetailsRows;
    }
	
    public List<Map<String, String>> payoutDetailstable(int tableID)
            throws Exception {
        List<Map<String, String>> payOutDetailsRows = new
                ArrayList<Map<String, String>>();
        String payoutDetailsTable = "//table[@id=" + tableID + "]/tbody/tr[*]";
        String payoutDetailsTablecolumns = "//table[@id=" + tableID +
                "]/tbody/tr[1]/th";

		List<WebElement> rows = driverFunctionLib.findElements(By.xpath(payOutDetailsTable));
		List<WebElement> numberofColumns =
                driverFunctionLib.findElements(By.xpath(payoutDetailsTablecolumns),
                        "");
		for (int i = 1; i < rows.size(); i++) {
			
			HashMap<String, String> payoutTableKeyValue = new HashMap<String, String>();
			List<WebElement> cells = rows.get(i).findElements(By.xpath("./td"));
			for (WebElement eachCell: cells) {
				payoutTableKeyValue.put(numberofColumns.get(tdNum).getText(), eachCell.getText());
			}
			
            payOutDetailsRows.add(payoutTableKeyValue);
		}
        return payOutDetailsRows;
    }
}