/**
*class StockPurchase
*@author Mert
*@version 1409
*/
public class StockPurchase{

private Stock stock;
private int numberOfShares;

/**
*First constructor - no args
*/
public StockPurchase(){
stock = new Stock();
}

/**
*Second constructor
*/
public StockPurchase(Stock stock, int numberOfShares){
setStock(stock);
setNumberOfShares(numberOfShares);
}

/**
*method getStock
*return stock
*/
public Stock getStock(){
return stock;
}

/**
*method getNumberOfShares
*return numberOfShares
*/
public int getNumberOfShares(){
return numberOfShares;
}

/**
*method setStock
*@param newStock
*/
public void setStock(Stock newStock){
if(newStock != null){
stock = newStock;
}else{
throw new IllegalArgumentException("stock cannot be null");
}
}

/**
*method setNumberOfShares
*@param numberOfShares
*/
public void setNumberOfShares(int numberOfShares){
if(numberOfShares > 0){
this.numberOfShares = numberOfShares;
}else{
throw new IllegalArgumentException("number of shares must be positive");
}
}

/**
*method getTotalCost
*return the cost of buying the numberOfshares 
*/
public double getTotalCost(){
return getNumberOfShares() * stock.getSharePrice();
}

/**
*method displayDetails
*/
public void displayDetails(){
stock.displayStockInfo();
System.out.println("Number of shares :" + getNumberOfShares());
System.out.println("Total cost of shares:" + stock.getStockSymbol()+ getTotalCost());
}
}