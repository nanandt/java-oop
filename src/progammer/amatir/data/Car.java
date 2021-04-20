package progammer.amatir.data;

public interface Car extends HasBrand, IsMaintenance{
    void drive(); // methotd di interface tdk perlu mnambhkan public abstrac krn sudh default methodnya
    int getTire();
}
