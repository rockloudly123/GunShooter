package actor;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author Nathan Dias <nathanxyzdias@gmail.com>
 */
public abstract class Actor {
    /**
     * Default Color of an Actor- standard java knowledge
     */
    public final java.awt.Color DEFAULT_COLOR=java.awt.Color.BLUE;//It's blue, people!
    
    
    public abstract Rectangle getRectangle();
    
    public abstract Image getImage();
    
}