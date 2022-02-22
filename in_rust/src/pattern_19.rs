pub fn pattern_19() {
    let row = 5;
    let column = 9;
    let mut symbol;
    let half_column = column / 2;

    for i in 0..row {
        symbol = 'A';
        for j in 0..column {
            if j >= half_column - i && j <= half_column + i {
                print!("{}", symbol);
                if j < half_column {
                    let s = symbol as u8 + 1;
                    symbol = s as char;
                } else {
                    let s = symbol as u8 - 1;
                    symbol = s as char;
                }
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
