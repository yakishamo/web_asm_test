import java.util.*;
import java.io.*;

class RFLAGS {
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

	public int toInt() {
		return cf &
			1  << 1 & 
			pf << 2 &
			0  << 3 &
			af << 4 &
			0  << 5 &
			zf << 6 &
			sf << 7 &
			tf << 8 &
			intf << 9 &
			df << 10 &
			of << 11 &
			iopl_1 << 12 &
			iopl_2 << 13 &
			nt << 14 &
			0  << 15 &
			rf << 16 &
			vm << 17 &
			ac << 18 &
			vif << 19 &
			vip << 20 &
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

	public boolean setCF(boolean b) {
		if(b) {
			return cf = 1;
		} else {
			return cf = 0;
		}
	}
	public boolean setPF(boolean b) {
		if(b) {
			return pf = 1;
		} else {
			return pf = 0;
		}
	public boolean setAF(boolean b) {
		if(b) {
			return af = 1;
		} else {
			return af = 0;
		}
	public boolean setZF(boolean b) {
		if(b) {
			return zf = 1;
		} else {
			return zf = 0;
	}
	public boolean setSF(boolean b) {
		if(b) {
			return sf = 1;
		} else {
			return sf = 0;
		}
	}
	public boolean setTF(boolean b) {
		if(b) {
			return tf = 1;
		} else {
			return tf = 0;
		}
	public boolean setIF(boolean b) {
		if(b) {
			return intf = 1;
		} else {
			return intf = 0;
		}
	public boolean setDF(boolean b) {
		if(b) {
			return df = 1;
		} else {
			return df = 0;
	}
	public boolean setOF(boolean b) {
		if(b) {
			return of = 1;
		} else {
			return of = 0;
		}
	}
	public int setIOPL(int i) {
		if(i > 3 || i < 0) {
			return -1;
		}
		IOPL_1 = i&1;
		IOPL_2 = (i>>1)&1;
		return i;
	}
	public boolean setNT(boolean b) {
		if(b) {
			return nt = 1;
		} else {
			return nt = 0;
		}
	public boolean setRF(boolean b) {
		if(b) {
			return rf = 1;
		} else {
			return rf = 0;
		}
	public boolean setVM(boolean b) {
		if(b) {
			return vm = 1;
		} else {
			return vm = 0;
	}
	public boolean setAC(boolean b) {
		if(b) {
			return ac = 1;
		} else {
			return ac = 0;
		}
	}
	public boolean setVIF(boolean b) {
		if(b) {
			return vif = 1;
		} else {
			return vif = 0;
		}
	public boolean setVIP(boolean b) {
		if(b) {
			return vip = 1;
		} else {
			return vip = 0;
		}
	public boolean setID(boolean b) {
		if(b) {
			return id = 1;
		} else {
			return id = 0;
	}
}

class CPU {
	protected long rax, rbx, rcx, rdx, rsp, rbp, rsi, rdi, rip, 
						r8, r9, r10, r11, r12, r13, r14, r15;
}

class test {
	public static void main(String[] args){
