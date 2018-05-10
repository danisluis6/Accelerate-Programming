import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VersionCode {

    private static String versionToComparable( String version )
    {
        String versionNum = version;
        System.out.print("Step 1: " + versionNum + "\n");
        int at = version.indexOf( '-' );
        System.out.print("Step 2: " + at +"\n");
        if ( at >= 0 )
            versionNum = version.substring( 0, at );

        String[] numAr = versionNum.split( "\\." );
        System.out.print("Step 3: " + numAr.length +"\n");
        System.out.print("Step 3: " + numAr[0] +"\n");
        System.out.print("Step 3: " + numAr[1] +"\n");
        System.out.print("Step 3: " + numAr[2] +"\n");
        
        String versionFormatted = "0";
        
        System.out.print("Step 4: " + String.format( "%4s", numAr[0] ) +"\n");
        System.out.print("Step 4: " + String.format( "%4s", numAr[1] ) +"\n");
        System.out.print("Step 4: " + String.format( "%4s", numAr[2] ) +"\n");
        
        for ( String tmp : numAr ){
            	versionFormatted += String.format( "%4s", tmp ).replace(' ', '0');
        }
        
        System.out.print("Step 4: " + versionFormatted +"\n");
        System.out.print("Step 5: " + versionFormatted.length() +"\n");
        
        while ( versionFormatted.length() < 12 )  {
            	versionFormatted += "0000";
        }
        
        System.out.print("Step 6: " + "version: "+ version +"\n");
        System.out.print("Step 6: " + "at: "+ at +"\n");
        return versionFormatted;
     }

    public static void main(String[] args) 
        {
//        checkVersion( "3.10.0", "3.4.0");
        checkVersion( "0.0.2", "5.4.1");
//        checkVersion( "5.4.4", "5.4.5");
//        checkVersion( "5.4.9", "5.4.12");
//        checkVersion( "5.9.222", "5.10.12");
//        checkVersion( "5.10.12", "5.10.12");
//        checkVersion( "5.10.13", "5.10.14");
//        checkVersion( "6.7.0", "6.8");
//        checkVersion( "6.7", "2.7.0");
//        checkVersion( "6", "6.3.1");
//        checkVersion( "4", "4.0.0");
//        checkVersion( "6.3.0", "6");
//        checkVersion( "5.10.12-Alpha", "5.10.12-beTA");
//        checkVersion( "5.10.13-release", "5.10.14-beta");
//        checkVersion( "6.7.0", "6.8-snapshot");
//        checkVersion( "6.7.1", "6.7.0-release");
//        checkVersion( "6-snapshot", "6.0.0-beta");
//        checkVersion( "6.0-snapshot", "6.0.0-whatthe");
//        checkVersion( "5.10.12-Alpha-1", "5.10.12-alpha-2");
//        checkVersion( "5.10.13-release-1", "5.10.13-release2");
//        checkVersion( "10-rc42", "10.0.0-rc53");
        }

    private static void checkVersion(String baseVersion, String testVersion) 
    {
        System.out.println( "isVersionHigher = " + isVersionHigher( baseVersion, testVersion ) );
        System.out.println( "---------------");
    }
    
    private static boolean isVersionHigher( String baseVersion, String testVersion )
    {
	    System.out.println( "versionToComparable( baseVersion ) =" + versionToComparable( baseVersion ) );
	    System.out.println( "versionToComparable( testVersion ) =" + versionToComparable( testVersion ) + " is this higher ?" );
	    return versionToComparable( testVersion ).compareTo( versionToComparable( baseVersion ) ) > 0;
    }
}

