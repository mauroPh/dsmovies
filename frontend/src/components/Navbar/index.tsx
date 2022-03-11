import {ReactComponent as GithubIcon}from 'assets/img/Github.svg';
import './styles.css';


function Navbar(){
    return (
        <header>
        <nav className="container">
            <div className="dsmovie-nav-content">
                <h1>RateMovies</h1>
                <a href="https://github.com/mauroPh" target="_blank" rel="noreferrer">
                    <div className="dsmovie-contact-container">
                        <GithubIcon />
                        <p className="dsmovie-contact-link">/mauroph</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    )
}
export default Navbar;