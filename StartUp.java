public class StartUp {
  public static void main(String[] args) {
    IssueBikeUI ui = new IssueBikeUI();
 
    ui.showBikeDetails(100);
    ui.calculateCost(5);
    ui.createCustomer("Les Hergraves", "PW2 6TR", 1462501339);
    ui.calculateTotalPayment();
  }
}
