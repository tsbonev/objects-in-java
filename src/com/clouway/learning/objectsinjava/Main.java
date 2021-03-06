package com.clouway.learning.objectsinjava;

import com.clouway.crm.core.Store.Clerk;
import com.clouway.crm.core.Store.Worker;
import com.clouway.crm.core.Sumator;
import com.clouway.crm.core.Tree.HeterogeneousTree;
import com.clouway.crm.core.Tree.HomogeneousTree;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Sumator sumator = new Sumator();

        System.out.println(sumator.sum(2, 2));
        System.out.println(sumator.sum((double)2.00, (double)2.34));
        System.out.println(sumator.sum("two", "three"));
        BigInteger bigIntA = new BigInteger("9911111111111");
        BigInteger bigIntB = new BigInteger("91155555555555");
        System.out.println(sumator.sum( bigIntA, bigIntB ));
        BigDecimal bigDecA = new BigDecimal("93.423421424636361241");
        BigDecimal bigDecB = new BigDecimal("1241.635537476475457");
        System.out.println(sumator.sum(bigDecA, bigDecB));

        /*
        HomogenousTree tree = new HomogenousTree();
        tree.add(30);
        tree.add(45);
        tree.add(12);
        tree.add(67);
        tree.add(11);
        tree.add(8);
        System.out.println(tree.contains(12));
        System.out.println(tree.contains(5));

        tree.printElements("pre-order");
        System.out.println("---");
        tree.printElements("in-order");
        System.out.println("---");
        tree.printElements("post-order");
        */

        HeterogeneousTree tree = new HeterogeneousTree();
        tree.add(new Worker());
        tree.add(new Clerk());
        tree.add(2);
        tree.add("Check");
        tree.add('C');

        tree.printElements("pre-order");
        System.out.println("---");
        tree.printElements("in-order");
        System.out.println("---");
        tree.printElements("post-order");


    }
}
