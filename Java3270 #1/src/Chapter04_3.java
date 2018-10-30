import java.util.Scanner;

public class Chapter04_3 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

final double radius = 6371.01;

double atlY = -84.3879824;
double atlX = 33.7489954;

double orlX = 28.5383355;
double orlY = -81.37923649999999;

double savX = 32.0808989;
double savY = -81.09120300000001;

double charX = 35.2270869;
double charY = -80.84312669999997;

/*
 * use herons formula for area to find triangle areas 
 */

double atlorlDistance = radius * Math.acos(Math.sin(Math.toRadians(atlX))) * Math.sin(Math.toRadians(orlX)) + Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(atlY)-Math.toRadians(orlY));
double atlsavDistance = radius * Math.acos(Math.sin(Math.toDegrees(savX))) * Math.sin(Math.toRadians(atlX)) + Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(savY)-Math.toRadians(atlY));
double orlsavDistance = radius * Math.acos(Math.sin(Math.toDegrees(orlX))) * Math.sin(Math.toRadians(savX)) + Math.cos(Math.toRadians(orlX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(orlY)-Math.toRadians(savY));

double s1 = (atlorlDistance + atlsavDistance + orlsavDistance)/2;
double area1 = Math.sqrt(s1*Math.abs((s1-atlorlDistance)*(s1-atlsavDistance)*(s1-orlsavDistance)));


double atlcharDistance = radius * Math.acos(Math.sin(Math.toRadians(atlX))) * Math.sin(Math.toRadians(charX)) + Math.cos(Math.toRadians(atlX)) * Math.cos(Math.toRadians(charX)) * Math.cos(Math.toRadians(atlY)-Math.toRadians(charY));
double charsavDistance = radius * Math.acos(Math.sin(Math.toDegrees(charX))) * Math.sin(Math.toRadians(savX)) + Math.cos(Math.toRadians(charX)) * Math.cos(Math.toRadians(savX)) * Math.cos(Math.toRadians(charY)-Math.toRadians(savY));

double s2 = (atlcharDistance + atlsavDistance + charsavDistance)/2;
double area2 = Math.sqrt(s2*Math.abs((s2-atlcharDistance)*(s2-atlsavDistance)*(s2-charsavDistance)));

System.out.println("The area of the polygon formed by Atlanta, Charlotte, Savannah, and Orlando is " + (area1+area2) + " km²");

	}

}
