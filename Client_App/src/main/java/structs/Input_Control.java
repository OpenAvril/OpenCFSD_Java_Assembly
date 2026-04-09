package structs;
import structs.praisesubsets.Input_praise0;
import structs.praisesubsets.Input_praise1;
import structs.praisesubsets.Input_praise2;
import structs.praisesubsets.Input_praise3;
public class Input_Control 
{
    public Input_Control()
    {
        
    }
    public void SelectSetInputSubset(Input objInput, User_Input objUserInput, int praiseId)
    {
        switch(praiseId)
        {
        case 0 -> {
            Input_praise0 inputPraise0 = (Input_praise0)objInput.dyn_REG_get_InputSubset();
            objInput.dyn_REG_set_InputSubset(inputPraise0);
            }

        case 1 -> {
            Input_praise1 inputPraise1 = (Input_praise1)objInput.dyn_REG_get_InputSubset();
            objInput.dyn_REG_set_InputSubset(inputPraise1);
            }

        case 2 -> {
            Input_praise2 inputPraise2 = (Input_praise2)objInput.dyn_REG_get_InputSubset();
            objInput.dyn_REG_set_InputSubset(inputPraise2);
            }

        case 3 -> {
            Input_praise3 inputPraise3 = (Input_praise3)objInput.dyn_REG_get_InputSubset();
            objInput.dyn_REG_set_InputSubset(inputPraise3);
            }
        }
    }
}
