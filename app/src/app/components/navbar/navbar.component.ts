import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {
  constructor(private router: Router) {}

  linkProduto(): void {
    this.router.navigate(['lista-produto'])
  }
  linkProjeto(): void {
    this.router.navigate(['lista-projeto'])
  }
}
