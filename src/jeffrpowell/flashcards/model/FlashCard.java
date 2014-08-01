package jeffrpowell.flashcards.model;

import java.io.Serializable;
import javax.swing.Icon;

public class FlashCard implements Serializable{

    private transient Icon image;
    private String prompt, answer;

    public FlashCard(Icon image, String prompt, String answer) {
        this.image = image;
        this.prompt = prompt;
        this.answer = answer;
    }
    
    public FlashCard(String prompt, String answer){
        this(null, prompt, answer);
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
