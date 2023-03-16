# Bienvenidos a mi resolución del Challenge Convertidor!

### El ejercicio se basa un conversor de divisas
#### Se puede convertir de (moneda local) a:
 * Dólares
 * Euros
 * Libras Esterlinas
 * Yenes Japoneses
 * Wons Sul-coreanos

> También es posible realizar la operación inversa


## Decidí implementar el patrón Strategy para resolver este ejercicio:

Cada Divisa contiene una clase propia, que implementa a la interfaz `Converter`
* Dicha interfaz contiene dos métodos: `ConvertTo(monto,monedaAConvertir)` y `ConvertFrom(monto,monedaOrigen)`

> Las implementaciones son guardadas en un `HashMap<String,Converter>`

La clase `ConverterContext` utilizará una implementación u otra, dependiendo de lo que se haya seleccionado
* La selección se realiza a través de un `JComboBox<String>`
  * Dicho JComboBox devolvería la key para obtener la implementación correspondiente
 
 ```
         this.currenciesOptions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String) currenciesOptions.getSelectedItem();
                converterContext.setConverter(converters.get(option));
            }
        });
 ```
 
### Aquí se encuentra un diagrama UML, espero les guste!

<img src="/Diagram.png"></img>
