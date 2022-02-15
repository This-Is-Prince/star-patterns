pub fn pattern_11() {
    let row = 9;
    let column = 5;
    let symbol = "*";
    let half_row = row / 2;

    for i in 0..row {
        for j in 0..column {
            if i <= half_row {
                if j <= i {
                    print!("{}", symbol);
                } else {
                    print!(" ");
                }
            } else {
                let temp_i = row - 1 - i;
                if j <= temp_i {
                    print!("{}", symbol);
                } else {
                    print!(" ");
                }
            }
        }
        println!();
    }
}
