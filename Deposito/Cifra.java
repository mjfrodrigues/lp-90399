/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estga.ti.lprog.cifracesar;

import java.text.Normalizer;

/**
 *
 * @author helder
 */
public class Cifra {
    
    /**
     * Método que cifra o texto fornecido usando a cifra de César.
     * O texo é previamente limpo de todos os espaços, acentos e cedilhas e apenas depois é cifrado.
     * A cifra não é efetuada se o texto contiver números ou outros caracteres gráficos visíveis, retornando null
     * @param txtOriginal   Texto a cifrar
     * @return  Uma String com o texto cifrado caso este não contenha números nem outros caracteres visíveis que não sejam letras
     *          null caso o texto a cifrar contenha números ou outros caracteres cisíveis que não sejam letras.
     */
    public  String cifra(String txtOriginal){
        String txtCifrado = "";
        
        System.out.println("Cifra:"+txtOriginal);
        String txt= adequaTextString(txtOriginal);
        if(txt!=null){
            for(int i=0;i<txt.length();i++){
                char charOriginal = txt.charAt(i);
                char charCifrado = (char)(((charOriginal -'A' + 3) % 26) + 'A');
                txtCifrado=txtCifrado + (char)charCifrado;
            }
        }

        return txtCifrado;
    }
        
    
    public  String decifra(String txtCifrado){
        String clear = "";
                
        String txt= adequaTextString(txtCifrado);
        if(txt!=null){
            for(int i=0;i<txt.length();i++){
                char charCifrado = txt.charAt(i);
                char charClaro;
                int x = (charCifrado -'A' - 3);
                if(x<0) charClaro = (char)(x+26+'A');
                else charClaro = (char)(x+'A');
                clear=clear + (char)charClaro;
            }
        }
        
        return clear;
    } 
    
    private String adequaTextString(String txt){
        String out=null;
        
        //converte para maiusculas
        String t=txt.toUpperCase();
        //Retira espaços
        t=t.trim();
        t = t.replaceAll("\\s", "");
        //Retira diacríticos
        t = Normalizer.normalize(t, Normalizer.Form.NFD);
        t=t.replaceAll("\\p{M}", "");
        if(t.matches(".*[A-Z]")) out=t; //Tem apenas letras
        return out;
    }
}
