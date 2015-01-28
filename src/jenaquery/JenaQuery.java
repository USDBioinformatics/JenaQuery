/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jenaquery;

import BioPortalOntology.BioPortalConnection;
import BioPortalOntology.BioPortalElement;
import BioPortalOntology.OntSearch;
import BioPortalOntology.OntologyFileRead;
import java.util.ArrayList;

/**
 *
 * @author Xinghua
 */
public class JenaQuery {
    
    
    public static void main(String[] args) throws Exception{        
        OntSearch ontSearch = new OntSearch();
        String testURI = "http://edamontology.org/data_2378";
        String testFile = "C:\\Users\\Xinghua\\Desktop\\EDAM_1.3.owl";
        String response = ontSearch.searchNodeFromFile(testURI, testFile);
        System.out.println(response); 
        
//         OntSearch ontSearch = new OntSearch();
//        String testURI = "http://edamontology.org/operation_0311";
//        String response = ontSearch.searchElementByURI(testURI);
//        System.out.println(response); 
            
//        BioPortalConnection bioPortal = new BioPortalConnection();
//        ArrayList<BioPortalElement> elements = bioPortal.executeQuery();  
//        for (BioPortalElement element : elements) {
//            System.out.println(element.getName() + element.getURI() + element.getParent().toString());  
//        }
        
//        OntologyFileRead ontFileRead = new OntologyFileRead();
//        ArrayList<BioPortalElement> elements = ontFileRead.readFile("C:\\Users\\Xinghua\\Desktop\\EDAM_1.3.owl");
//        for (BioPortalElement element : elements) {
//            System.out.println(element.getName() + element.getURI() + element.getParent().toString());  
//        }
    }
    
}
