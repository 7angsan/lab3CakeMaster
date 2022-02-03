package cs301.birthdaycake;

public class CakeController {
    private CakeView viewCake;
    private CakeModel modelCake;

    public CakeController(CakeView ref) {
        viewCake = ref;
        modelCake = viewCake.getCakeModel();
    }
}
