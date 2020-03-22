package fr.uvsq21506437.dip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hello world!
 *
 */
public class App 
{
	/*
	 * Ici on viol DIP car la classe dépend d'une bibliothèque technique qui est l'affichage"
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello World");
    }
}
