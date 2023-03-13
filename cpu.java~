class RFLAGS {
	RFLAGS() {
		cf = pf = af = zf = sf = tf = intf = df = of = iopl_1 = iopl_2 = 
		nt = rf = vm = ac = vif = vip = id = 0;
	}
	protected int
		cf,   //(0)キャリーフラグ
		pf,   //(2)パリティフラグ
		af,   //(4)調整フラグ
		zf,   //(6)ゼロフラグ
		sf,   //(7)符号フラグ
		tf,   //(8)トラップフラグ
		intf, //(9)割り込み可能フラグ
		df,   //(10)方向フラグ
		of,   //(11)オーバーフローフラグ
		iopl_1, //(12)I/O特権レベルフィールド（2ビット）
		iopl_2, //(13)
		nt,   //(14)Nested Task
		rf,   //(16)再開フラグ
		vm,   //(17)仮想8086モード
		ac,   //(18)アライメントチェック
		vif,  //(19)バーチャル割り込み
		vip,  //(20)バーチャル割り込み保留
		id;   //(21)識別フラグ

	public String toString() {
		String ret = "[ ";
		if(CF()) ret = ret + "CF ";
		if(AF()) ret = ret + "PF ";
		if(ZF()) ret = ret + "ZF ";
		if(SF()) ret = ret + "SF ";
		if(TF()) ret = ret + "TF ";
		if(IF()) ret = ret + "IF ";
		if(DF()) ret = ret + "DF ";
		if(OF()) ret = ret + "OF ";
		if(NT()) ret = ret + "NT ";
		if(RF()) ret = ret + "RF ";
		if(VM()) ret = ret + "VM ";
		if(AC()) ret = ret + "AC ";
		if(VIF()) ret = ret + "VIF ";
		if(VIP()) ret = ret + "VIP ";
		if(ID()) ret = ret + "ID ";
		ret = ret + "] IOPL:" + IOPL();
		return ret;
	}
	public int toInt() {
		return 
			cf << 0 |
			1  << 1 | 
			pf << 2 |
			0  << 3 |
			af << 4 |
			0  << 5 |
			zf << 6 |
			sf << 7 |
			tf << 8 |
			intf << 9 |
			df << 10 |
			of << 11 |
			iopl_1 << 12 |
			iopl_2 << 13 |
			nt << 14 |
			0  << 15 |
			rf << 16 |
			vm << 17 |
			ac << 18 |
			vif << 19 |
			vip << 20 |
			id << 21;
	}

	public boolean CF() {
		return cf == 1;
	}
	public boolean PF() {
		return pf == 1;
	}
	public boolean AF() {
		return af == 1;
	}	
	public boolean ZF() {
		return zf == 1;
	}	
	public boolean SF() {
		return sf == 1;
	}	
	public boolean TF() {
		return tf == 1;
	}	
	public boolean IF() {
		return intf == 1;
	}	
	public boolean DF() {
		return df == 1;
	}	
	public boolean OF() {
		return of == 1;
	}	
	public int IOPL() {
		return iopl_1 & iopl_2 << 1;
	}
	public boolean NT() {
		return nt == 1;
	}	
	public boolean RF() {
		return rf == 1;
	}	
	public boolean VM() {
		return vm == 1;
	}	
	public boolean AC() {
		return ac == 1;
	}	
	public boolean VIF() {
		return vif == 1;
	}	
	public boolean VIP() {
		return vip == 1;
	}	
	public boolean ID() {
		return id == 1;
	}

	public RFLAGS setCF(boolean b) {
		if(b) {
			cf = 1;
		} else {
			cf = 0;
		}
		return this;
	}
	public RFLAGS setPF(boolean b) {
		if(b) {
			pf = 1;
		} else {
			pf = 0;
		}
		return this;
	}
	public RFLAGS setAF(boolean b) {
		if(b) {
			af = 1;
		} else {
			af = 0;
		}
		return this;
	}
	public RFLAGS setZF(boolean b) {
		if(b) {
			zf = 1;
		} else {
			zf = 0;
		}
		return this;
	}
	public RFLAGS setSF(boolean b) {
		if(b) {
			sf = 1;
		} else {
			sf = 0;
		}
		return this;
	}
	public RFLAGS setTF(boolean b) {
		if(b) {
			tf = 1;
		} else {
			tf = 0;
		}
		return this;
	}
	public RFLAGS setIF(boolean b) {
		if(b) {
			intf = 1;
		} else {
			intf = 0;
		}
		return this;
	}
	public RFLAGS setDF(boolean b) {
		if(b) {
			df = 1;
		} else {
			df = 0;
		}
		return this;
	}
	public RFLAGS setOF(boolean b) {
		if(b) {
			of = 1;
		} else {
			of = 0;
		}
		return this;
	}
	public RFLAGS setIOPL(int i) {
		if(i >= 0 && i <= 3) {
			iopl_1 = i&1;
			iopl_2 = (i>>1)&1;
		}
		return this;
	}
	public RFLAGS setNT(boolean b) {
		if(b) {
			nt = 1;
		} else {
			nt = 0;
		}
		return this;
	}
	public RFLAGS setRF(boolean b) {
		if(b) {
			rf = 1;
		} else {
			rf = 0;
		}
		return this;
	}
	public RFLAGS setVM(boolean b) {
		if(b) {
			vm = 1;
		} else {
			vm = 0;
		}
		return this;
	}
	public RFLAGS setAC(boolean b) {
		if(b) {
			ac = 1;
		} else {
			ac = 0;
		}
		return this;
	}
	public RFLAGS setVIF(boolean b) {
		if(b) {
			vif = 1;
		} else {
			vif = 0;
		}
		return this;
	}
	public RFLAGS setVIP(boolean b) {
		if(b) {
			vip = 1;
		} else {
			vip = 0;
		}
		return this;
	}
	public RFLAGS setID(boolean b) {
		if(b) {
			id = 1;
		} else {
			id = 0;
		}
		return this;
	}
}

class REGISTER {
	protected long reg;
	protected String name;
	protected int bit_size;
	protected boolean upper;
	REGISTER(String name) {
		this.name = name;
		bit_size = 64;
	}
	
	public long toInt() {
		if(upper && bit_size == 8) {
			return reg & (0xff00);
		}
		return reg & (0xffffffff >>> bit_size);
	}

	public long set(long a) {
		return reg = a;//だめ～～～～～
	}
}

class CPU {
	protected long rax, rbx, rcx, rdx, rsp, rbp, rsi, rdi, rip, 
						r8, r9, r10, r11, r12, r13, r14, r15;
}

class test {
	public static void main(String[] args){
		RFLAGS rflags = new RFLAGS();
		System.out.printf("%s\n", rflags);
		rflags.setCF(true).setAC(true).setDF(true).setIOPL(2);
		System.out.printf("%d\n", rflags.toInt());
		System.out.print(rflags);
	}
}

