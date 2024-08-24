/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canner.baitaptentuoinam;

import java.util.Scanner;


public class CannerBaitaptentuoinam {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ten , gioitinh , chuyennghanh, quequan;
        int tuoi , namsinh ;
        double Gpa ;
        System.out.println("nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi = scanner.nextInt();
        System.out.println("nhap namsinh: ");
        namsinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhap gioitinh: ");
        gioitinh = scanner.nextLine();
        System.out.println(" nhap chuyennghanh: ");
        chuyennghanh = scanner.nextLine();
        System.out.println("nhap quequan: ");
        quequan = scanner.nextLine();
        System.out.println("nhap Gpa: ");
        Gpa = scanner.nextDouble();
        System.out.println(ten +"-" + tuoi + "-" + gioitinh + "-" + namsinh + "-" + chuyennghanh + "-" + quequan + "-" + Gpa);
               
    }
    
}
