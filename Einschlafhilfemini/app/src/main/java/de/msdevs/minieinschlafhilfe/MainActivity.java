package de.msdevs.minieinschlafhilfe;

import android.app.*;
import android.os.*;
import android.app.*;
import android.content.*;
import android.os.*;
import android.provider.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.text.*;
import android.text.method.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		getSupportActionBar().setHomeButtonEnabled(true);  
		getSupportActionBar().setDisplayShowHomeEnabled(true);  
		getSupportActionBar().setDisplayUseLogoEnabled(true);  
		getSupportActionBar().setLogo(R.drawable.ic_launcher);  
		getSupportActionBar().setDisplayShowTitleEnabled(true);
		
		
		//Button aus dem main.xml layout
		final Button button = (Button) findViewById(R.id.btn_choose);
//RandomGenerator für die zufällige auswahl einer folge
		final Random randomGenerator = new Random();
//Array list mit folgen items
		final ArrayList folgen = new ArrayList() {{ 
				add("Verschollen in der Zeit:(Die Dr3i)");
				add("Tödliche Regie:(Die Dr3i)");
				add("Das Haus der 1.000 Rätsel:(Die Dr3i)");
				add("und der kopflose Reiter:(Die Dr3i)");
				add("Der Jahrhundertstein:(Die Dr3i)");
				add("Die Pforte zum Jehenseits:(Die Dr3i)");
				add("Zug um Zug:(Die Dr3i)");
				add("Superpapagei:1"); 
			 	add("und das Gespensterschloss:11"); 
				add("Toteninsel:100");
				add("und der schrullige Millionär:46"); 
				add("Die flüsternden Puppen:180");
				add("und der Teufelsberg:19");
				add("SMS aus dem Grab:129");
				add("und die schwarze Katze:4");
				add("Die verschwundene Seglerin:71");
				add("Der tote Mönch:134");
				add("und der unheimliche Drache:7");
				add("und die Fußball-Falle:138");
				add("und die flammende Spur:20");
				add("Tödliches Eis:142");
				add("und die feurige Flut:148");
				add("Dämon der Rache:173");
				add("und die Rache der Samurai:145");
				add("und der Phantomsee:2");
				add("und die Rache des Tigers:61");
				add("und das Bergmonster:14");
				add("Die geheime Treppe:138");
				add("und die gefährliche Erbschaft:17");
				add("Schwarze Sonne:151");
				add("und der Karpatenhund:3");
				add("Im Zeichen der Schlangen:157");
				add("Codename Cobra:116");
				add("und der Tanzende Teufel:21");
				add("Rufmord:99");
				add("und der Schatz im Bergsee:68");
				add("und der magische Kreis:27");
				add("Dopingmixer:60");
				add("und die Schattenmänner:66");
				add("Geheimakte Ufo:80");
				add("und der rote Rächer:96");
				add("Der geheime Schlüssel:119");
				add("Brainwash:Sonderfolge");
				add("Geister-Canyon:124");
				add("und die Rache der Samurai:145");
				add("Schrecken aus dem Moor:126");
				add("Der tote Mönch:134");
				add("Pfad der Angst:137");
				add("und die Poker-Hölle:143");
				add("Poltergeist:73");
				add("und der dreiTag:Sonderfolge");
				add("Gekaufte Spieler:55");
				add("Master of Chess:Sonderfolge");
				add("Meuterei auf hoher See:83");
				add("und das Riff der Haie:30");
				add("und das Narbengesicht:31");
				add("und die bedrohte Ranch:33");
				add("und der Rote pirat:34");
				add("und der Höhlenmensch:35");
				add("und der Super-Wal:36");
				add("und der gestohlene Sieg:176");
				add("Schattenwelt:175");
				add("Die Rache des Untoten:179");
				add("und der heimliche Hehler:37");
				add("und die Perlenvögel:39");
				add("und die Automafia:53");
				add("Das leere Grab:78");
				add("Im Netz des Drachen:156");
				add("Das Kabinett des Zauberers:181");
				add("Stadt der Vampire:140");
				add("Fels der Dämonen:133");
				add("Wolfsgesicht:87");
				add("Der Biss der Bestie:146");
				add("und die Poker-Hölle:143");
				add("und die Automarder:40");
				add("Tatort Zirkus:57");
				add("Feuermond:125");
				add("und das Gold der Wikinger:45");
				add("Straße des Grauens:170");
				add("Gift per Email:104");
				add("Im schatten des Giganten:165");
				add("und das Volk der Winde:41");
				add("Das Auge des Drachen:113");
				add("und der Eisenmann:172");
				add("Nacht der Tiger:159"); 
				add("Schwarze Madonna:127");
				add("Geisterbucht:150");
				add("Das Erbe des Meisterdiebs:103");
				add("Stimmen aus dem Nichts:76");
				add("Schattenwelt:175");
				add("Der schwarze Skorpion:120");
				add("Pistenteufel:77");
				add("und der gestohlene Sieg:176");
				add("der Geist des Goldgräberd:177");
				add("Der gefiederte Schrecken:178");
				add("und die flüsternde Mumie:10"); 
				add("und der grüne Geist:8"); 
			}};
		
		
		button.setOnClickListener(new View.OnClickListener()
			{
				public void onClick(View v)
				{
					//Folge von den folgen auswählen lassen über den randomgenerator
					String folge = (String) folgen.get(randomGenerator.nextInt(folgen.size()));

					
					//Folge von der Folgennummer spliten
					

					final String string_teil_eins;
					final String string_teil_zwei;
					String[] itemSplit = folge.split(":");
					string_teil_eins = itemSplit[0];
					string_teil_zwei = itemSplit[1];
					
                     //Anzeigen lassen über TextView		
					//gesplitete Folgen Strings hinzufügen. (Neue Zeile)
					 TextView tv_folge = (TextView)findViewById(R.id.tv_folge);
					 tv_folge.setText("Name:" + " " + string_teil_eins + "\n" + "Nummer:" + " " + string_teil_zwei);
					
					}
				});
			
			
		
    }
}
