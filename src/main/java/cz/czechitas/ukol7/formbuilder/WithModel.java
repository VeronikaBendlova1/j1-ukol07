package cz.czechitas.ukol7.formbuilder;

import java.awt.*;

/**
 * @author Filip Jirsák
 */
public interface WithModel<B> {
  FormBuilderWithContainer<B> container(Container container);
}
