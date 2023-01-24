import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main {
  
  //main method
  public static void main(String[] args) throws IOException {
    //Create a file object
    File highScore = new File("highscore.txt");
    //Create a reader object to read the file
    Scanner myReader = new Scanner(highScore);
    //lines means how many lines are in the file
    int lines = 0;

    //Count how many lines in the original file
    while(myReader.hasNextLine()){
      myReader.nextLine();
      System.out.println("i");
    }
    
    myReader.reset();
		int c = 2;
		double s = 3;


    for(int i = 0; i < lines; i++){
      if(lines%2 == 1){
        name[i/2] = myReader.nextLine();
      }else{
        score[i/2] = Integer.parseInt(myReader.nextLine());
      }
    }



    for(String s:name){
      System.out.println(s);
    }

    for(int i:score){
      System.out.println(i);
    }

    myReader.close();
    
  }
  //add name and score method

  //delete method
  
  //sort by first letter of the name method

  //recursive method to sort the name fully

  //find a name and score by using binary search method

  
}