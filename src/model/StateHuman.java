package model;

public enum StateHuman {
    AVAILIBLE(2000), DISABLE(100), AWAY(100), BUSSY(100);

    private int period;

    StateHuman(int period){
       this.period= period;
    }

    public int getPeriod(){
        return period;
    }

}
