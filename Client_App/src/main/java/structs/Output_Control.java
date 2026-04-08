package structs;
import structs.praisesubsets.Output_praise0;
import structs.praisesubsets.Output_praise1;
import structs.praisesubsets.Output_praise2;
import structs.praisesubsets.Output_praise3;
public class Output_Control 
{
    public Output_Control()
    {
        
    }
    public void SelectSetOutputSubset(Output objOutput, User_Output objUserOutput, int praiseId)
    {
        switch(praiseId)
        {
        case 0 -> {
            Output_praise0 inputPraise0 = (Output_praise0)objOutput.dyn_REG_get_OutputSubset();
            objOutput.dyn_REG_set_OutputSubset(inputPraise0);
            }

        case 1 -> {
            Output_praise1 inputPraise1 = (Output_praise1)objOutput.dyn_REG_get_OutputSubset();
            objOutput.dyn_REG_set_OutputSubset(inputPraise1);
            }

        case 2 -> {
            Output_praise2 inputPraise2 = (Output_praise2)objOutput.dyn_REG_get_OutputSubset();
            objOutput.dyn_REG_set_OutputSubset(inputPraise2);
            }

        case 3 -> {
            Output_praise3 inputPraise3 = (Output_praise3)objOutput.dyn_REG_get_OutputSubset();
            objOutput.dyn_REG_set_OutputSubset(inputPraise3);
            }
        }
    }
}
