import greenfoot.*;  

/**
Aquí se selecciona el modo de juego que se desee jugar.
 */
public class Seleccionador extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    
    public Seleccionador()
    {    
        super(700, 700, 1);
        Mundos();
    }
    
    private void Mundos(){
        addObject(new Clasico_(), 350,100);
        addObject(new Imstillstanding_(),350,200);
        addObject(new Jumpfight_(),350,300);
        addObject(new Restricted_(),350,400);
        addObject(new Newpieces_(), 350,500);
        addObject(new Revuelta_(),350,600);
        addObject(flecha, 100,100);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion != 0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion != 5) {opcion--;}
        
        flecha.setLocation(100 , 600 + (opcion*100));
        
        //Aquí es donde se seleccionará el modo de juego
        if (Greenfoot.isKeyDown("ENTER") || Greenfoot.isKeyDown("SPACE")){
            switch(opcion){ 
                case 0:
                    Greenfoot.setWorld(new Tablero());
                    break;
                    
                case 1:
                    Greenfoot.setWorld(new Imstillstanding());
                    break;
                    
                case 2:
                    Greenfoot.setWorld(new Jumpfight());
                    break;
                    
                case 3:
                    Greenfoot.setWorld(new Restricted());
                    break;
                    
                case 4:
                    Greenfoot.setWorld(new Tablero());
                    break;
                    
                case 5:
                    Greenfoot.setWorld(new revuelta());
                    break;
            }
        }
    }
}
