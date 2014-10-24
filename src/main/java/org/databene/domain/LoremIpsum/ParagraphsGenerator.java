package org.databene.domain.LoremIpsum;

import net._01001111.text.LoremIpsum;
import org.databene.benerator.util.ThreadSafeNonNullGenerator;

/**
 *
 * @author eric.chaves
 */
public class ParagraphsGenerator extends ThreadSafeNonNullGenerator<String> {
    
    
    private LoremIpsum loremIpsum = new LoremIpsum();
    protected int count = 2;
    
    public Class<String> getGeneratedType() {
        return String.class;
    }

    public ParagraphsGenerator() {
        this.count = 2;
    }

    public ParagraphsGenerator(int count) {
        this.count = count;
    }

    
    
    @Override
    public String generate() {
        return loremIpsum.paragraphs( this.count );
    }
    
       
}