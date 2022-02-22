pub fn pattern_20() {
    let row = 4;
    let column = 8;
    let mut first_symbol;
    let mut second_symbol;
    let half_column = column / 2;

    for i in 0..row {
        first_symbol = 'A';
        second_symbol = 1;
        for j in 0..column {
            if j >= half_column - 1 - i && j <= half_column + i {
                if j < half_column {
                    print!("{}", first_symbol);
                    let s = first_symbol as u8 + 1;
                    first_symbol = s as char;
                } else {
                    print!("{}", second_symbol);
                    second_symbol += 1;
                }
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
