/**
*The program calculates and presents the charging time for an electric car in a table depending on different combinations of current and voltage.
* 
* pseudokod for project:
* 1. Creats variables for currents and voltage,
* 2. calculates charging powers in kW and charging time
* 3. the calculations for charging power and charging time are rounded to two decimals
* 4. Print the table
*
* @author Johanna Petersson, ojoepe-5
*/

class Main 
{
  public static void main(String[] args) 
  {
    //sets storage power of car batteri
    float storagePower = 35.8f; 

    //Sets the tre currents as variables
    int currentOne = 10;
    int currentTwo = 16;
    int currentThree = 32;

    //Sets the two voltage as variables
    int voltageSingel = 230;
    int voltageThree = 400;


    //calculates the charging power (in kW) for singel phase voltage
    float chargeOneSingel = (currentOne * voltageSingel)/1000F;
    double chargeTwoSingel = (currentTwo * voltageSingel)/1000F;
    //calculates the charging power (in kW) for three phase voltage
    double chargeOneThree = (currentOne * voltageThree * Math.sqrt(3))/1000F;
    double chargeTwoThree = (currentTwo * voltageThree * Math.sqrt(3))/1000F;
    double chargeThreeThree = (currentThree * voltageThree * Math.sqrt(3))/1000F;

    //calculates the 5 carging times
    double timeOneSingel = storagePower / chargeOneSingel;
    double timeTwoSingel = storagePower / chargeTwoSingel;
    double timeOneThree = storagePower / chargeOneThree;
    double timeTwoThree = storagePower / chargeTwoThree;
    double timeThreeThree = storagePower / chargeThreeThree;

    //Recalulates the charging power and charging time to two decimals
    //Constants and variables needed
    int noOfDecimals = 2;
    double scale = 0;
    scale = Math.pow(10, noOfDecimals); 
    //Recalulations of charging power
    chargeTwoSingel = Math.round(chargeTwoSingel * scale) / scale;
    chargeOneThree = Math.round(chargeOneThree * scale) / scale;
    chargeTwoThree = Math.round(chargeTwoThree * scale) / scale;
    chargeThreeThree = Math.round(chargeThreeThree * scale) / scale;
    //Recalulations of charging Time
    timeOneSingel = Math.round(timeOneSingel * scale) / scale;
    timeTwoSingel = Math.round(timeTwoSingel * scale) / scale;
    timeOneThree = Math.round(timeOneThree * scale) / scale;
    timeTwoThree = Math.round(timeTwoThree * scale) / scale;
    timeThreeThree = Math.round(timeThreeThree * scale) / scale;


    //Print the table
    System.out.print("Batteri " + storagePower + "(kWh)\n");
    System.out.print("Ström(A) \t Spänning(V) \t Laddeffekt (kW) \t Laddningstid(h)\n"); //prints the labels for the columns
    System.out.print(currentOne + "\t\t\t\t" + voltageSingel + "\t\t\t\t" + chargeOneSingel + "\t\t\t\t\t" + timeOneSingel + "\n");
    System.out.print(currentTwo + "\t\t\t\t" + voltageSingel + "\t\t\t\t" + chargeTwoSingel + "\t\t\t\t" + timeTwoSingel + "\n");
    System.out.print(currentOne + "\t\t\t\t" + voltageThree + "\t\t\t\t" + chargeOneThree + "\t\t\t\t" + timeOneThree + "\n"); 
    System.out.print(currentTwo + "\t\t\t\t" + voltageThree + "\t\t\t\t" + chargeTwoThree + "\t\t\t\t" + timeTwoThree + "\n"); 
    System.out.print(currentThree + "\t\t\t\t" + voltageThree + "\t\t\t\t" + chargeThreeThree + "\t\t\t\t" + timeThreeThree + "\n");

  }
}