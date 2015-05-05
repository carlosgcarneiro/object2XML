/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2xml;

/**
 *
 * @author caca
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
 
 
public class JDOMXMLWriter {
 
    public void create() throws IOException {
        List<Pessoa> pessoaList = new ArrayList<>();
        List<Celular> celularList = new ArrayList<>();
        celularList.add(new Celular("84621872", "OI"));
        celularList.add(new Celular("94428261", "TIM"));
        pessoaList.add(new Pessoa(24,"Carlos", 74, celularList));
        celularList = new ArrayList<>();
        celularList.add(new Celular("88622039", "OI"));
        pessoaList.add(new Pessoa(58,"Das Graças", 50, celularList));
        celularList = new ArrayList<>();
        celularList.add(new Celular("85322742", "OI"));
        pessoaList.add(new Pessoa(23,"Mariana", 59, celularList));
        System.out.println(pessoaList); 
        String fileName = "teste.xml";
        writeFileUsingJDOM(pessoaList, fileName);
    }
 
    public void writeFileUsingJDOM(List<Pessoa> pessoaList, String fileName) throws IOException {
        Document doc = new Document();
        doc.setRootElement(new Element("Pessoas",  ""));
        for(Pessoa p : pessoaList){
            System.out.println(p);
            Element pessoa = new Element("Pessoa");
            pessoa.setAttribute("id",""+p.getIdentidade());
            pessoa.addContent(new Element("nome").setText(p.getNome()));
            pessoa.addContent(new Element("idade").setText(""+p.getIdade()));
            pessoa.addContent(new Element("peso").setText(""+p.getPeso()));
            Element celulares = new Element("Celulares");
            for(Celular c: p.getCelulares()){
                Element celular = new Element("Celular");
                celular.setAttribute("id",""+c.getIdCel());
                celular.addContent(new Element("numero").setText(""+c.getNumero()));
                celular.addContent(new Element("operadora").setText(""+c.getOperadora()));
                celulares.addContent(celular);
            }
            
            pessoa.addContent(celulares);
            doc.getRootElement().addContent(pessoa);
        }
        //JDOM document is ready now, lets write it to file now
        XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
        //output xml to console for debugging
        //xmlOutputter.output(doc, System.out);
        xmlOutputter.output(doc, new FileOutputStream(fileName));
    }
 
}
