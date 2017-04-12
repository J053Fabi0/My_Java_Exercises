            import java.util.*;
            import java.io.*;
            public class Main {

            /*
                                                          ,'/                               
                                                         . / ___                            
                                                ___/\   / /'`_  `'.                         
                                   __  _     .-' :/  \:/ /-'` \   )                         
                              .-'``  \` \  .'.') ) /\ / /      :  |                         
                           .'`  .--.  ) .)/ / /-'__\// /       |  |                         
                        .'` .-'`  .| .'.|: @_-'`` \  \/\..--.  |  (   _.-._                 
                      ,' .'`      |' | |'| ( /.    '-.__\    ) (   `''.-'` `.               
                    .'.-`         | .| | | \  ) \__.  |      |  `---``      )               
                  .' (_.'         | |'.| | ('` ,_     `.     :       .--.   /               
                .'    /   .       | | |' (  \    `\-.-'       \  .-'`    |  \               
               -  .  (_.-'        | | |   \ |\     \    __     ``        |   `''--.,        
             .` .'  .   /  /      | | :    \| `-._  \.'`  '.       .--.  `-..-'``'. )       
             '-'/  /   (  /       | : (     |'-,  `-.)\     \    .'    )       __ ) )       
               /  /    /``(  .'   ( (  '..-':'  `-,  A )     \_.'      (_ .---:  )| /       
              /  /    /    '`'  .  \ '---''`       \ V )`-.            .-`     '.(((        
             '  /    /    /  `'`(_. `''    .'`      )-'    `-..___..-'`          \ ``.'     
            (  /    /    /   /  /  / / ,'-`      |  | \                           ''`       
             '`/   /    /   /  /  /.''`.'        |  :  \                                    
              /   /    /   /  /`-'    /  ..---.  |  '.  \                                   
             (   //   /   /(_/     _ /. . ,    )/|.  '.  \                                  
              `-'(   /   /     .-'` ( -(_)-   /  '|   '. (\                                 
                  `-'`--'    /`      \' ' ` .'    |.  ('.` \  ,.---.                        
                            (_        `--''`````\ '| .-` \.-'`_     \                       
                             /       ___        /  '..''``''`` `\    .                      
                            (``''''``   \       `--'`            \   |       ..--.          
                             \          (__,..-'`        ___     (   '\   .-`__\  \  .--.   
                              '-..----..,          ,.-'``   `-.   \__.'''` ,'  ``--``    '.'
                                         \     .-'`           _\     .--.-''.     .-'``''`  
                                          \.-'`            .-'  `\`'`.'`     \_.-'          
                                           '.__________.-'`       `'`                       
            */


              public static void main(String[] args) {
                Main func = new Main();
                System.out.println("\nSi funciona\n");
                System.exit(0);
              }

              boolean almostIncreasingSequence(int[] s) {
                Arrays.sort(s);
                int n = s[1] - s[0];
                int i = 0;
                int numsDel = 0;
                boolean ret = false;

                while(numsDel < 2 && i < s.length) {
                	if(!(i+1 > s.length)) { //Si aún tiene un numero adelante
                		if( !(s[i+1]-s[i] == n) ) { //Si la diferencia del de adelante con el de atrás no es la constante de diferencia
                      if(!(i+2 > s.length)) { //Nos aseguramos de que podamos obtener el segundo numero adelante del que estamos
                        if(s[i+2]-s[i] == n) { //Si sí podemos preguntamos si el segundo si cumple con la constante
                          //Si sí cumple significa que el i+1 es el numero malo
                          ret = true; //El return es true
                          numsDel++; //"Eliminamos" el i+1
                          i++; //"Con esto lo pasamos por alto a la proxima vez"
                        }
                        else { //Si no cumple con la constante significa que tenemos 2 numeros que no cumplen y eso retorna falso
                          ret = false;
                          numsDel+=2; //Esto detendrá el while y ret se quedará en false
                        }
                      }
            	    	}
                    else { }//Si sí es la constante tu sigue, 
                	}
                	else { //Si ya no tiene un numero adelante significa que ah pasado las "pruebas" y es true
                		ret = true;
                    numsDel += 2; //Esto detiendrá el while, si es que piensa repetirse
                	}

                  i++;
                }

                return ret;

              }
            }