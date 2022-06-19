package cz.czechitas.ukol7.formbuilder;

import javax.swing.*;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Filip Jirsák
 */
public interface WithLabel<B> {
    WithInput<B> textField(String property);

    WithInput<B> textField(String property, Consumer<JTextField> configuration);

    WithInput<B> numberField(String property);

    WithInput<B> numberField(String property, Consumer<JFormattedTextField> configuration);

    WithInput<B> dateField(String property);

    WithInput<B> dateField(String property, Consumer<JFormattedTextField> configuration);

    <E> WithInput<B> comboBox(String property, List<E> items);

    <E> WithInput<B> comboBox(String property, List<E> items, Consumer<JComboBox<E>> configuration);

    WithInput<B> checkbox(String label, String property);

    WithInput<B> checkbox(String label, String property, Consumer<JCheckBox> configuration);

    WithInput<B> radioButton(String label, String property, Object choice);

    WithInput<B> radioButton(String label, String property, Object choice, Consumer<JRadioButton> configuration);
}