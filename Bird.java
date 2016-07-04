/**
 * Created by Peter.Barron on 04/07/2016.
 */

public abstract class Bird {
    /* because this is an abstract
    method the body will be blank */
    public abstract boolean fly();

    public boolean feathers;
    public boolean layEggs;

    public boolean getFeathers() {
        return this.feathers;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public boolean getLayEggs() {
        return this.layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

}
