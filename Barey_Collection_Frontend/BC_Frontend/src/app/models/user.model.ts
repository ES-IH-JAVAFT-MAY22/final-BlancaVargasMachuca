

export interface User {
    id: number | null;
    username: string;
    password: string;
    name: string;
    email: string;
    telephoneNumber: number | null;
    address: string;
    roles: string[];
}
