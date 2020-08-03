package org.academiadecodigo.felinux.networking;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println("HostName: " + str);
            InetAddress address = InetAddress.getByName(str);
            System.out.println("Testing Reachability for " + address.getHostAddress() + " : " + address.isReachable(50));
        }catch (UnknownHostException err){
            System.out.println(err.getMessage());
        }catch (IOException err){
            System.out.println(err.getMessage());
        }finally {
            sc.close();
        }

    }


}
