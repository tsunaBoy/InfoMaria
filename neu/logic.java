public class logic
{
    private window fenster;
    private int punkte = 0;
    public logic()
    {
        init();
    }
    public void init()
    {
        fenster = new window();
    }
    public void setPunkte(int punkte)
    {
        this.punkte = punkte;
    }
    public int getPunkte()
    {
        return this.punkte;
    }
}
