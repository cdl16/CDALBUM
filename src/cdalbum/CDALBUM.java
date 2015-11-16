/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdalbum;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author clantz8935
 */
public class CDALBUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   ArrayList Playlist = new ArrayList();
   

    

    ArrayList HellFreezesOver = new ArrayList();
    HellFreezesOver.add("Hell Freezes Over");
    HellFreezesOver.add("By The Eagles:");
    HellFreezesOver.add("Tequila Sunrise");
    HellFreezesOver.add("Life in the Fast Lane");
    HellFreezesOver.add("Hotel California");
    
    ArrayList BackAtTheBando = new ArrayList();
    BackAtTheBando.add("Back At The Bando");
    BackAtTheBando.add("By Migos");
    BackAtTheBando.add("Pamela");
    BackAtTheBando.add("Forest Whitacker");
    BackAtTheBando.add("Burnt Out");
    
    ArrayList CarterIV = new ArrayList();
    CarterIV.add("Tha Carter IV");
    CarterIV.add("By Lil Wayne");
    CarterIV.add("6 Foot 7 Foot");
    CarterIV.add("Nightmares of the Bottom");
    CarterIV.add("MegaMan");
    
    ArrayList DTSpace = new ArrayList();
    DTSpace.add("DTSpacelyMadeThis");
    DTSpace.add("By Rich Homie Quan");
    DTSpace.add("Chardonnay");
    DTSpace.add("I Get");
    DTSpace.add("Basement");
    
    
  Playlist.add(BackAtTheBando);
  Playlist.add(HellFreezesOver);
  Playlist.add(CarterIV);
  Playlist.add(DTSpace);
  System.out.println(Playlist);
    Scanner Question = new Scanner(System.in);
    String Askforalbum = "What Album are you adding? Use underscore for space";
    String AlbumName = ""; //holds album name
    System.out.println(Askforalbum);
    AlbumName = Question.next();
 Playlist.add(AlbumName);
    
 //Scanner Artist = new Scanner(System.in);
    //String Askforartist = "What is the artist name? Use underscore for space";
    
 System.out.println(Playlist);


 Scanner Remover = new Scanner(System.in);
String AskToRemove = "What album would you like to remove? Press: 1=BAB 2=HFO 3=Cart 4=DT";
 System.out.println(AskToRemove);
 String Removed = "";
 
Removed = Remover.next();
int choice = Integer.parseInt(Removed);
//System.out.print(Removed);

if(choice == 1){ 
  Playlist.remove(BackAtTheBando);
}
if(choice == 2){
    Playlist.remove(HellFreezesOver);
}
if(choice == 3){
    Playlist.remove(CarterIV);
}
if(choice == 4){
    Playlist.remove(DTSpace);
}
    
System.out.println(Playlist);


    


 
 
         
  
  
    
    
   
    
    
    
    }
    
}

                 
