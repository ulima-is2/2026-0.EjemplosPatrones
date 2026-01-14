package patrones.abstract_factory;

public class FabricaMago extends FabricaItems{

    @Override
    public Arma crearArma() {
        return new Baculo();
    }

    @Override
    public Armadura crearArmadura() {
        return new Tunica();
    }

}
