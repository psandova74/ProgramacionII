package Practico02Persona;

public enum IMC {
	BAJO_PESO, 

	NORMO_PESO {
		public String toString() {
			return "La persona tiene peso normal";
		}
	}, 

	SOBRE_PESO {
		public String toString() {
			return "La persona tiene sobre peso";
		}
	}
}
