package card;

import card.node.*;
import card.analysis.*;

public class SemanticAnalyzer extends DepthFirstAdapter {

    public void caseTIdentifier(TIdentifier node){
        System.out.println("ident node seen: " + node);
    }

    /*public void outAAssignAssignrest(AAssignAssignrest node){
        System.out.println("AAssignAssignrest node: " + node);
        System.out.println("AAssignAssignrest right identifier seen: " + node.getIdentifier());
    }

    public void outADeclareStatement(ADeclareStatement node){
        System.out.println("ADeclareStatement node: " + node);
        System.out.println("ADeclareStatement Identifier node: " + node.getIdentifier());
    }

    public void outAAssignStatement(AAssignStatement node){
        System.out.println("AAssignStatement node: " + node);
        System.out.println("AAssignStatement node: " + node.getIdentifier());
    }*/


}