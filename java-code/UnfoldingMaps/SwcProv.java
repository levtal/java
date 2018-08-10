/*http://unfoldingmaps.org/tutorials/index.html
 * 
 * */


package module1;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.providers.*;
import de.fhpotsdam.unfolding.mapdisplay.MapDisplayFactory;
/** SwcProv
  * An application with two maps side-by-side zoomed in on different locations.
  * Author: UC San Diego Coursera Intermediate Programming team
  * @author Your name here
  * Date: July 17, 2015
  * */
public class SwcProv extends PApplet
{
	/** Your goal: add code to display second map, zoom in, and customize the background.
	 * Feel free to copy and use this code, adding to it, modifying it, etc.  
	 * Don't forget the import lines above. */

	// You can ignore this.  It's to keep eclipse from reporting a warning
	private static final long serialVersionUID = 1L;

	/** This is where to find the local tiles, for working without an Internet connection */
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	// IF YOU ARE WORKING OFFLINE: Change the value of this variable to true
	private static final boolean offline = false;
	
	/** The map we use to display our home town: La Jolla, CA */
	UnfoldingMap currentMap;
	UnfoldingMap map1, map2,map3,map4,map5;
	
	public void setup() {
		size(800, 600, P2D);  // Set up the Applet window to be 800x600
		                      // The OPENGL argument indicates to use the 
		                      // Processing library's 2D drawing
		                      // You'll learn more about processing in Module 3

		// This sets the background color for the Applet.  
		// Play around with these numbers and see what happens!
		this.background(200, 200, 200);
		
 // Select a map provider
 AbstractMapProvider provider_google = new Google.GoogleTerrainProvider();
 // AbstractMapProvider provider_google = new Google.GoogleMapProvider();
 
 
 AbstractMapProvider provider_microsoft = new Microsoft.AerialProvider();
 AbstractMapProvider provider_openstreet = new OpenStreetMap.CloudmadeProvider(MapDisplayFactory.OSM_API_KEY, 23058);                                
 AbstractMapProvider provider_microsoft_road = new Microsoft.RoadProvider();
 AbstractMapProvider provider_default = MapDisplayFactory.getDefaultProvider();
 
 
 
 // Set a zoom level
		int zoomLevel = 10;
 // Create a new UnfoldingMap to be displayed in this window.  
// The 2nd-5th arguments give the map's x, y, width and height
// When you create your map we want you to play around with these 
// arguments to get your second map in the right place.
// The 6th argument specifies the map provider.  
// There are several providers built-in.
// Note if you are working offline you must use the MBTilesMapProvider
 map1 = new UnfoldingMap(this,  50, 50, 850, 800,provider_google);
 map2 = new UnfoldingMap(this, 50, 50, 850, 800,provider_microsoft);
 map3 = new UnfoldingMap(this,  50, 50, 850, 800,provider_openstreet);
 map4 = new UnfoldingMap(this,  50, 50, 850, 800,provider_microsoft_road);
 map5 = new UnfoldingMap(this,  50, 50, 850, 800,provider_default);		
		
		// The next line zooms in and centers the map (latitude,longitude)
 map1.zoomAndPanTo(zoomLevel, new Location(52.5f, 13.4f));
 map2.zoomAndPanTo(zoomLevel, new Location(52.5f, 13.4f));
 map3.zoomAndPanTo(zoomLevel, new Location(52.5f, 13.4f));
 map4.zoomAndPanTo(zoomLevel, new Location(52.5f, 13.4f));
 map5.zoomAndPanTo(zoomLevel, new Location(52.5f, 13.4f));
		
	    currentMap = map2;
	 // This line makes the map interactive
	 //MapUtils.createDefaultEventDispatcher(this, map1);
	 		
  MapUtils.createDefaultEventDispatcher(this,map1,map2, map3,map4, map5);
 }

	 
 public void draw() {
	background(0);
     currentMap.draw();
  }

 public void keyPressed() {
	if (key == '1') {
			currentMap = map1;
		} else if (key == '2') {
			currentMap = map2;
		} else if (key == '3') {
			currentMap = map3;
		}else if (key == '4') {
			currentMap = map4;
		}else if (key == '5') {
			currentMap = map5;
		}
	
	
	}
	
}
