class check2 extends check1 {
    public void checkPrime2() {

        if (x < 2) {
            System.out.println(x + " is not a prime number.");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(x + " is a prime number.");
        } else {
            System.out.println(x + " is not a prime number.");
        }
    }

    }


