package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {

        public static void main(String[] args) {
            int dogCount = 1;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

            int catCount = 2;
            System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

            int turtleCount = 0;
            System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

            flipNHeads(3);

            clock();

        }

        public static String pluralize(String name , int num){
            if(num == 1){
                return name;
            }
            else
                return name+"s";

        }

        public static void flipNHeads(int n){
            Random random = new Random();
            double rand = random.nextDouble();
            int countHeads=0;
            int countFlips=0;

            while (countHeads<n){
                if(rand >= .5){
                    countHeads++;
                    System.out.println("heads");
                }
                else{
                    System.out.println("tails");
                    countHeads=0;
                }
                countFlips++;
                rand = random.nextDouble();
            }

            System.out.println( "It took "+countFlips+" flips to flip "+n +" head in a row.");
        }

        public static void clock(){
            LocalDateTime now =  LocalDateTime.now();
            String oldTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            String newTime= "";
            int opCount=0;
            while(true){
                now =  LocalDateTime.now();
                newTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                if(oldTime.equals(newTime)){
                    opCount++;
                    continue;
                }
                System.out.println(newTime+"   "+((double)opCount/1000000)+" MHz");
                opCount=0;
                oldTime = newTime;
            }

        }
    }

