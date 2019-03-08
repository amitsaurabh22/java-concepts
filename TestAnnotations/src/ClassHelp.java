
public @interface ClassHelp {
	
	Integer a=10;	
	 String author();
	   String date();
	   int currentRevision() default 1;
	   String lastModified() default "NA" ;
	   String lastModifiedBy() ;
	   // Note use of array
	   String[] reviewers();
	   
	   enum Direction {
		   RIGHT,LEFT,UTERN;	
	   }

}
