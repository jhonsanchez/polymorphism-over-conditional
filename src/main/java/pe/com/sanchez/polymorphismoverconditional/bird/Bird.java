package pe.com.sanchez.polymorphismoverconditional.bird;

public abstract class Bird {
    public abstract double getSpeed();

    public static Bird of(String type) {
        if (type == null)
            throw new IllegalArgumentException("Tipo de ave no puede ser nulo");
        Type tipoAve = Type.valueOf(type.toUpperCase());
        switch (tipoAve) {
            case AFRICAN:
                return new AfricanBird();
            case AMERICAN:
                return new AmericanBird();
            case EUROPEAN:
                return new EuropeanBird();
        }
        throw new IllegalArgumentException("type no reconocido");
    }

    enum Type{
        AMERICAN, AFRICAN, EUROPEAN
    }
}

