//Given a route containing 4 directions(E,W,N,S).Find a shortest path to reach
//a destination ("WNEENESENNNN")

import java.util.*; 

public class shortestPath{
    public static float getShortestPath(String path){
        int x = 0 , y = 0;

        for(int i = 0 ; i < path.length() ; i++){
            char dir = path.charAt(i);

            //South
            if(dir == 'S'){
                y--;
            } 

            //North
            else if(dir == 'N'){
                y++;
            } 

            //West
            else if(dir == 'W'){
                x--;
            } 

            //East
            else{
                x++;
            } 

        } 

        int x_sq = x*x;
        int y_sq = y*y;

        return (float)Math.sqrt(x_sq + y_sq);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
