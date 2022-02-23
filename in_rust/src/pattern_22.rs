pub fn pattern_22() {
    let row = 5;
    let column = 9;
    let half_column = column / 2;

    let mut first_symbol: u8;
    let mut second_symbol: u8;

    for i in 0..row {
        first_symbol = 1;
        second_symbol = 65;

        for j in 0..column {
            if j >= half_column - i && j <= half_column + i {
                if j <= half_column {
                    print!("{}", first_symbol);
                    first_symbol += 1;
                } else {
                    print!("{}", second_symbol as char);
                    second_symbol += 1;
                }
            } else {
                print!(" ");
            }
        }
        println!();
    }
}
