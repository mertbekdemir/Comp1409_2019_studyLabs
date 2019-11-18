/**
*class Stock
*@author Mert 
*@version 1409
*/

public class Stock{

private String stockSymbol;
private double sharePrice;

/**
*First constructor - 
*
*/
public Stock(String stockSymbol, double sharePrice){
setStockSymbol(stockSymbol);
setSharePrice(sharePrice);
}

/**
*Second constructor - no args
*
*/
public Stock(){
sharePrice = 0;
stockSymbol = "unknown";
}

/**
*method getStockSymbol
*@return stockSymbol
*/
public String getStockSymbol(){
return stockSymbol;
}

/**
*method getSharePrice
*return sharePrice
*/
public double getSharePrice(){
return sharePrice;
}

/**
*method setStockSymbol
*@param newStockSymbol
*/
public void setStockSymbol(String newStockSymbol){
if(newStockSymbol != null){
stockSymbol = newStockSymbol;
}else{
throw new IllegalArgumentException("stock symbol cannot be null");
}
}
/**
*method setSharePrice
*@param newSharePrice
*/
public void setSharePrice(double newSharePrice){
if(newSharePrice > 0){
sharePrice = newSharePrice;
}else{
throw new IllegalArgumentException("share price must be positive");
}
}

/**
*method displayStockInfo
*/
public void displayStockInfo(){
System.out.println("Stock symbol :" + getStockSymbol());
System.out.println("Share price :" + getSharePrice());
}

}